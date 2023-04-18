package com.example.meditationui.ui.screens.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import com.example.meditationui.R


@Composable
fun TopBar(name: String, time: String = "day") {

    ConstraintLayout {
        val constraints = ConstraintSet {
            val greetingText = createRefFor("greetingText")
            val messageText = createRefFor("messageText")
            val searchIcon = createRefFor("searchIcon")

            constrain(greetingText) {
                top.linkTo(parent.top)
                start.linkTo(parent.start)
            }
            constrain(messageText) {
                top.linkTo(parent.bottom)
                start.linkTo(parent.start)
            }
            constrain(searchIcon) {
                top.linkTo(greetingText.top)
                start.linkTo(parent.absoluteRight)
            }

        }

        ConstraintLayout(
            constraints,
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp)
        ) {
            Box(Modifier.layoutId("greetingText")) {
                if(time=="day") Text("Good Morning, $name", style = MaterialTheme.typography.h2)
                else Text("Good Evening, $name", style = MaterialTheme.typography.h2)
            }

            Box(Modifier.layoutId("messageText")) {
                Text("We Wish You Have a Good Day!", style = MaterialTheme.typography.body1)
            }

            Box(modifier = Modifier
                .padding()
                .layoutId("searchIcon")
                .clickable { }
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_search),
                    contentDescription = "Search",
                    modifier = Modifier.size(24.dp),
                    tint = Color.White
                )
            }

        }
    }

}
