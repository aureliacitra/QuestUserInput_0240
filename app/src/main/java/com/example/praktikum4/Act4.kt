package com.example.praktikum4

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

@Composable
fun FormDataDiri(modifier: Modifier){
    //variable2 untuk mengingat nilai masukan dri keyboard
    var textName by remember { mutableStateOf(value="") }
    var textAlamat by remember { mutableStateOf(value="") }
    var textJK by remember { mutableStateOf(value="") }
    var gender:List<String> = listOf("laki-laki", "Perempuan")

    //variabel-variabel untuk menyimpan data yang diperoleh dari komponen UI
    var nama by remember { mutableStateOf(value = "")}
    var alamat by remember { mutableStateOf(value = "")}
}