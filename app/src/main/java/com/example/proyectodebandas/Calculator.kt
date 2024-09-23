package com.example.resistencia

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Checkbox
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Slider

@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview(showBackground = true)
fun calculatorResistances(){

    var banda1 by remember { mutableStateOf<String?>(null) }
    var banda2 by remember { mutableStateOf<String?>(null) }
    var bandaM by remember { mutableStateOf<String?>(null) }
    var bandaT by remember { mutableStateOf<String?>(null) }
    var isExpanded by remember { mutableStateOf(false) }
    var isExpanded2 by remember { mutableStateOf(false) }
    var isExpanded3 by remember { mutableStateOf(false) }
    var isExpanded4 by remember { mutableStateOf(false) }
    var resultado by remember { mutableStateOf<String>("") }
    var isLiked by remember { mutableStateOf(false) }
    var rating by remember { mutableStateOf(0) }
    var sliderValue by remember { mutableStateOf(0f) }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(10.dp),
        verticalArrangement = Arrangement.Center,
    ) {
        item {
            Column {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Checkbox(
                        checked = isLiked,
                        onCheckedChange = { isLiked = it }
                    )
                    Text(text = if (isLiked) "Sí, me gusta" else "No, no me gusta")
                }

                Spacer(modifier = Modifier.height(16.dp))

                Text(text = "Califica la aplicación:")
                for (i in 1..5) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        RadioButton(
                            selected = (rating == i),
                            onClick = { rating = i }
                        )
                        Text(text = "$i")
                    }
                }

                 Spacer(modifier = Modifier.height(16.dp))

                Text(text = "Selecciona un valor (0 - 10000): ${sliderValue.toInt()}")
                Slider(
                    value = sliderValue,
                    onValueChange = { sliderValue = it },
                    valueRange = 0f..10000f,
                    steps = 9999,
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(16.dp))
            }
        }


        item{

            Text(
                text = "RESISTENCIA 3 BANDAS",
                color = Color.Black,
                modifier = Modifier.fillMaxWidth(),
                fontSize = 24.sp,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold
            )

            // DropMenu valor banda 1
            Box(
                modifier = androidx.compose.ui.Modifier
                    .fillMaxSize()
                    .padding(10.dp),
                contentAlignment = Alignment.Center
            ){
                ExposedDropdownMenuBox(expanded = isExpanded,
                    onExpandedChange = {isExpanded = it}
                ) {
                    TextField(value = banda1?:"Valor banda 1",
                        onValueChange = {},
                        readOnly = true,
                        trailingIcon = {
                            ExposedDropdownMenuDefaults.TrailingIcon(expanded = isExpanded)
                        },
                        colors = ExposedDropdownMenuDefaults.textFieldColors(),
                        modifier = androidx.compose.ui.Modifier.menuAnchor()
                    )

                    ExposedDropdownMenu(
                        expanded = isExpanded,
                        onDismissRequest = { isExpanded = false }
                    ) {
                        DropdownMenuItem(
                            text = {
                                Row {
                                    Box(
                                        modifier = Modifier
                                            .size(24.dp)
                                            .background(Color.Black)
                                    )
                                    Text(text = "  Negro - 0")
                                }
                            },
                            onClick = {
                                banda1 = "0"
                                isExpanded = false
                            }
                        )
                        DropdownMenuItem(
                            text = {
                                Row {
                                    Box(
                                        modifier = Modifier
                                            .size(24.dp)
                                            .background(Color(0xFFA52A2A))
                                    )
                                    Text(text = "  Marrón - 1")
                                }
                            },
                            onClick = {
                                banda1 = "1"
                                isExpanded = false
                            }
                        )
                        DropdownMenuItem(
                            text = {
                                Row {
                                    Box(
                                        modifier = Modifier
                                            .size(24.dp)
                                            .background(Color.Red)
                                    )
                                    Text(text = "  Rojo - 2")
                                }
                            },
                            onClick = {
                                banda1 = "2"
                                isExpanded = false
                            }
                        )
                        DropdownMenuItem(
                            text = {
                                Row {
                                    Box(
                                        modifier = Modifier
                                            .size(24.dp)
                                            .background(Color(0xFFFFA500))
                                    )
                                    Text(text = "  Naranja - 3")
                                }
                            },
                            onClick = {
                                banda1 = "3"
                                isExpanded = false
                            }
                        )
                        DropdownMenuItem(
                            text = {
                                Row {
                                    Box(
                                        modifier = Modifier
                                            .size(24.dp)
                                            .background(Color.Yellow)
                                    )
                                    Text(text = "  Amarillo - 4")
                                }
                            },
                            onClick = {
                                banda1 = "4"
                                isExpanded = false
                            }
                        )
                        DropdownMenuItem(
                            text = {
                                Row {
                                    Box(
                                        modifier = Modifier
                                            .size(24.dp)
                                            .background(Color.Green)
                                    )
                                    Text(text = "  Verde - 5")
                                }
                            },
                            onClick = {
                                banda1 = "5"
                                isExpanded = false
                            }
                        )
                        DropdownMenuItem(
                            text = {
                                Row {
                                    Box(
                                        modifier = Modifier
                                            .size(24.dp)
                                            .background(Color.Blue)
                                    )
                                    Text(text = "  Azul - 6")
                                }
                            },
                            onClick = {
                                banda1 = "6"
                                isExpanded = false
                            }
                        )
                        DropdownMenuItem(
                            text = {
                                Row {
                                    Box(
                                        modifier = Modifier
                                            .size(24.dp)
                                            .background(Color(0xFFFF00FF))
                                    )
                                    Text(text = "  Magenta - 7")
                                }
                            },
                            onClick = {
                                banda1 = "7"
                                isExpanded = false
                            }
                        )
                        DropdownMenuItem(
                            text = {
                                Row {
                                    Box(
                                        modifier = Modifier
                                            .size(24.dp)
                                            .background(Color.Gray)
                                    )
                                    Text(text = "  Gris - 8")
                                }
                            },
                            onClick = {
                                banda1 = "8"
                                isExpanded = false
                            }
                        )
                        DropdownMenuItem(
                            text = {
                                Row {
                                    Box(
                                        modifier = Modifier
                                            .size(24.dp)
                                            .background(Color.White)
                                    )
                                    Text(text = "  Blanco - 9")
                                }
                            },
                            onClick = {
                                banda1 = "9"
                                isExpanded = false
                            }
                        )


                    }

                }

            }

            // DropMenu valor banda 2
            Box(

                modifier = androidx.compose.ui.Modifier
                    .fillMaxSize()
                    .padding(10.dp),
                contentAlignment = Alignment.Center
            ){
                ExposedDropdownMenuBox(expanded = isExpanded2,
                    onExpandedChange = {isExpanded2 = it}
                ) {
                    TextField(value = banda2?:"Valor banda 2",
                        onValueChange = {},
                        readOnly = true,
                        trailingIcon = {
                            ExposedDropdownMenuDefaults.TrailingIcon(expanded = isExpanded)
                        },
                        colors = ExposedDropdownMenuDefaults.textFieldColors(),
                        modifier = androidx.compose.ui.Modifier.menuAnchor()
                    )

                    ExposedDropdownMenu(
                        expanded = isExpanded2,
                        onDismissRequest = { isExpanded2 = false }
                    ) {
                        DropdownMenuItem(
                            text = {
                                Row {
                                    Box(
                                        modifier = Modifier
                                            .size(24.dp)
                                            .background(Color.Black)
                                    )
                                    Text(text = "  Negro - 0")
                                }
                            },
                            onClick = {
                                banda2 = "0"
                                isExpanded2 = false
                            }
                        )
                        DropdownMenuItem(
                            text = {
                                Row {
                                    Box(
                                        modifier = Modifier
                                            .size(24.dp)
                                            .background(Color(0xFFA52A2A))
                                    )
                                    Text(text = "  Marrón - 1")
                                }
                            },
                            onClick = {
                                banda2 = "1"
                                isExpanded2 = false
                            }
                        )
                        DropdownMenuItem(
                            text = {
                                Row {
                                    Box(
                                        modifier = Modifier
                                            .size(24.dp)
                                            .background(Color.Red)
                                    )
                                    Text(text = "  Rojo - 2")
                                }
                            },
                            onClick = {
                                banda2 = "2"
                                isExpanded2 = false
                            }
                        )
                        DropdownMenuItem(
                            text = {
                                Row {
                                    Box(
                                        modifier = Modifier
                                            .size(24.dp)
                                            .background(Color(0xFFFFA500))
                                    )
                                    Text(text = "  Naranja - 3")
                                }
                            },
                            onClick = {
                                banda2 = "3"
                                isExpanded2 = false
                            }
                        )
                        DropdownMenuItem(
                            text = {
                                Row {
                                    Box(
                                        modifier = Modifier
                                            .size(24.dp)
                                            .background(Color.Yellow)
                                    )
                                    Text(text = "  Amarillo - 4")
                                }
                            },
                            onClick = {
                                banda2 = "4"
                                isExpanded2 = false
                            }
                        )
                        DropdownMenuItem(
                            text = {
                                Row {
                                    Box(
                                        modifier = Modifier
                                            .size(24.dp)
                                            .background(Color.Green)
                                    )
                                    Text(text = "  Verde - 5")
                                }
                            },
                            onClick = {
                                banda2 = "5"
                                isExpanded2 = false
                            }
                        )
                        DropdownMenuItem(
                            text = {
                                Row {
                                    Box(
                                        modifier = Modifier
                                            .size(24.dp)
                                            .background(Color.Blue)
                                    )
                                    Text(text = "  Azul - 6")
                                }
                            },
                            onClick = {
                                banda2 = "6"
                                isExpanded2 = false
                            }
                        )
                        DropdownMenuItem(
                            text = {
                                Row {
                                    Box(
                                        modifier = Modifier
                                            .size(24.dp)
                                            .background(Color(0xFFFF00FF))
                                    )
                                    Text(text = "  Magenta - 7")
                                }
                            },
                            onClick = {
                                banda2 = "7"
                                isExpanded2 = false
                            }
                        )
                        DropdownMenuItem(
                            text = {
                                Row {
                                    Box(
                                        modifier = Modifier
                                            .size(24.dp)
                                            .background(Color.Gray)
                                    )
                                    Text(text = "  Gris - 8")
                                }
                            },
                            onClick = {
                                banda2 = "8"
                                isExpanded2 = false
                            }
                        )
                        DropdownMenuItem(
                            text = {
                                Row {
                                    Box(
                                        modifier = Modifier
                                            .size(24.dp)
                                            .background(Color.White)
                                    )
                                    Text(text = "  Blanco - 9")
                                }
                            },
                            onClick = {
                                banda2 = "9"
                                isExpanded2 = false
                            }
                        )


                    }

                }

            }

            // DropMenu valor banda 3
            Box(
                modifier = androidx.compose.ui.Modifier
                    .fillMaxSize()
                    .padding(10.dp),
                contentAlignment = Alignment.Center
            ){
                ExposedDropdownMenuBox(expanded = isExpanded3,
                    onExpandedChange = {isExpanded3 = it}
                ) {
                    TextField(value = bandaM?:"Multiplicador",
                        onValueChange = {},
                        readOnly = true,
                        trailingIcon = {
                            ExposedDropdownMenuDefaults.TrailingIcon(expanded = isExpanded)
                        },
                        colors = ExposedDropdownMenuDefaults.textFieldColors(),
                        modifier = androidx.compose.ui.Modifier.menuAnchor()
                    )

                    ExposedDropdownMenu(
                        expanded = isExpanded3,
                        onDismissRequest = { isExpanded3 = false }
                    ) {
                        DropdownMenuItem(
                            text = {
                                Row {
                                    Box(
                                        modifier = Modifier
                                            .size(24.dp)
                                            .background(Color.Black)
                                    )
                                    Text(text = "  Negro - x1")
                                }
                            },
                            onClick = {
                                bandaM = "x1"
                                isExpanded3 = false
                            }
                        )
                        DropdownMenuItem(
                            text = {
                                Row {
                                    Box(
                                        modifier = Modifier
                                            .size(24.dp)
                                            .background(Color(0xFFA52A2A))
                                    )
                                    Text(text = "  Marrón - x10")
                                }
                            },
                            onClick = {
                                bandaM = "x10"
                                isExpanded3 = false
                            }
                        )
                        DropdownMenuItem(
                            text = {
                                Row {
                                    Box(
                                        modifier = Modifier
                                            .size(24.dp)
                                            .background(Color.Red)
                                    )
                                    Text(text = "  Rojo - x100")
                                }
                            },
                            onClick = {
                                bandaM = "x100"
                                isExpanded3 = false
                            }
                        )
                        DropdownMenuItem(
                            text = {
                                Row {
                                    Box(
                                        modifier = Modifier
                                            .size(24.dp)
                                            .background(Color(0xFFFFA500))
                                    )
                                    Text(text = "  Naranja - x1000")
                                }
                            },
                            onClick = {
                                bandaM = "x1000"
                                isExpanded3 = false
                            }
                        )
                        DropdownMenuItem(
                            text = {
                                Row {
                                    Box(
                                        modifier = Modifier
                                            .size(24.dp)
                                            .background(Color.Yellow)
                                    )
                                    Text(text = "  Amarillo - x10000")
                                }
                            },
                            onClick = {
                                bandaM = "x10000"
                                isExpanded3 = false
                            }
                        )
                        DropdownMenuItem(
                            text = {
                                Row {
                                    Box(
                                        modifier = Modifier
                                            .size(24.dp)
                                            .background(Color.Green)
                                    )
                                    Text(text = "  Verde - x100000")
                                }
                            },
                            onClick = {
                                bandaM = "x100000"
                                isExpanded3 = false
                            }
                        )
                        DropdownMenuItem(
                            text = {
                                Row {
                                    Box(
                                        modifier = Modifier
                                            .size(24.dp)
                                            .background(Color.Blue)
                                    )
                                    Text(text = "  Azul - x1000000")
                                }
                            },
                            onClick = {
                                bandaM = "x1000000"
                                isExpanded3 = false
                            }
                        )
                        DropdownMenuItem(
                            text = {
                                Row {
                                    Box(
                                        modifier = Modifier
                                            .size(24.dp)
                                            .background(Color(0xFFFF00FF))
                                    )
                                    Text(text = "  Magenta - x10000000")
                                }
                            },
                            onClick = {
                                bandaM = "x10000000"
                                isExpanded3 = false
                            }
                        )
                        DropdownMenuItem(
                            text = {
                                Row {
                                    Box(
                                        modifier = Modifier
                                            .size(24.dp)
                                            .background(Color.Gray)
                                    )
                                    Text(text = "  Gris - x100000000")
                                }
                            },
                            onClick = {
                                bandaM = "x100000000"
                                isExpanded3 = false
                            }
                        )
                        DropdownMenuItem(
                            text = {
                                Row {
                                    Box(
                                        modifier = Modifier
                                            .size(24.dp)
                                            .background(Color.White)
                                    )
                                    Text(text = "  Blanco - x1000000000")
                                }
                            },
                            onClick = {
                                bandaM = "x1000000000"
                                isExpanded3 = false
                            }
                        )
                        DropdownMenuItem(
                            text = {
                                Row {
                                    Box(
                                        modifier = Modifier
                                            .size(24.dp)
                                            .background(Color(0xFFFFFF80))
                                    )
                                    Text(text = "  Dorado - x0.1")
                                }
                            },
                            onClick = {
                                bandaM = "x0.1"
                                isExpanded3 = false
                            }
                        )
                        DropdownMenuItem(
                            text = {
                                Row {
                                    Box(
                                        modifier = Modifier
                                            .size(24.dp)
                                            .background(Color(0xFFD3D3D3))
                                    )
                                    Text(text = "  Plateado - x0.01")
                                }
                            },
                            onClick = {
                                bandaM = "x0.01"
                                isExpanded3 = false
                            }
                        )


                    }

                }

            }

            // DropMenu valor banda 4
            Box(
                modifier = androidx.compose.ui.Modifier
                    .fillMaxSize()
                    .padding(10.dp),
                contentAlignment = Alignment.Center
            ){
                ExposedDropdownMenuBox(expanded = isExpanded4,
                    onExpandedChange = {isExpanded4 = it}
                ) {
                    TextField(value = bandaT?:"Tolerancia",
                        onValueChange = {},
                        readOnly = true,
                        trailingIcon = {
                            ExposedDropdownMenuDefaults.TrailingIcon(expanded = isExpanded)
                        },
                        colors = ExposedDropdownMenuDefaults.textFieldColors(),
                        modifier = androidx.compose.ui.Modifier.menuAnchor()
                    )

                    ExposedDropdownMenu(
                        expanded = isExpanded4,
                        onDismissRequest = { isExpanded4 = false }
                    ) {
                        DropdownMenuItem(
                            text = {
                                Row {
                                    Box(
                                        modifier = Modifier
                                            .size(24.dp)
                                            .background(Color(0xFFFFFF80))
                                    )
                                    Text(text = "  Dorado - +/- 5%")
                                }
                            },
                            onClick = {
                                bandaT = "+/- 5%"
                                isExpanded4 = false
                            }
                        )
                        DropdownMenuItem(
                            text = {
                                Row {
                                    Box(
                                        modifier = Modifier
                                            .size(24.dp)
                                            .background(Color(0xFFD3D3D3))
                                    )
                                    Text(text = "  Plateado - +/- 10%")
                                }
                            },
                            onClick = {
                                bandaT = "+/- 10%"
                                isExpanded4 = false
                            }
                        )
                        DropdownMenuItem(
                            text = {
                                Row {
                                    Box(
                                        modifier = Modifier
                                            .size(24.dp)
                                            .background(Color.Transparent)
                                    )
                                    Text(text = "  Ninguno - +/- 20%")
                                }
                            },
                            onClick = {
                                bandaT = "+/- 20%"
                                isExpanded4 = false
                            }

                        )

                    }

                }

            }

            Box(
                modifier = androidx.compose.ui.Modifier
                    .fillMaxSize()
                    .padding(10.dp),
                contentAlignment = Alignment.Center
            ){

                Button(onClick = {
                    // Llamamos a la función calcularResistencia y actualizamos el resultado
                    resultado = calcularResistencia(banda1 ?: "0", banda2 ?: "0", bandaM ?: "x1", bandaT ?: "+/- 0%")
                }) {
                    Text("Calcular resistencia")
                }


            }
            Text(
                text = resultado,
                color = Color.Black,
                modifier = Modifier.fillMaxWidth(),
                fontSize = 16.sp,
                textAlign = TextAlign.Center
            )


        }


    }



}


fun calcularResistencia(banda1:String, banda2:String, banda3:String, banda4:String): String{

    val bandasConcatenadas: Int = (banda1 + banda2).toIntOrNull()?:0

    var multiplicador:Double = when(banda3){

        "x1" -> 1.0
        "x10" -> 10.0
        "x100" -> 100.0
        "x1000" -> 1000.0
        "x10000" -> 10000.0
        "x100000" -> 100000.0
        "x1000000" -> 1000000.0
        "x10000000" -> 10000000.0
        "x100000000" -> 100000000.0
        "x1000000000" -> 1000000000.0
        "x0.1" -> 0.1
        "x0.01" -> 0.01

        else -> 1.0
    }

    val resultado = bandasConcatenadas * multiplicador

    return "La resistencia es de $resultado Ohms \nTolerancia: $banda4"

}
