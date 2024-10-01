package br.com.fiap.trabfiap.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.trabfiap.R

@Composable
fun LoginScreen() {

    Column (
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp)
    ){
        Column (
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .offset(y = 20.dp),
        ){
            Column {
                Image(
                    painter = painterResource(id = R.drawable.agrolink),
                    contentDescription = "Imagem de logo agrolink",
                    modifier = Modifier
                        .size(300.dp)
                        .offset(y = 50.dp)
                )
            }
        }

        // --- formulário
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
                .offset(y = 40.dp),
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding(
                        vertical = 50.dp,
                        horizontal = 10.dp
                    )
            ) {
                Text(
                    text = "E-mail",
                    modifier = Modifier
                        .padding(bottom = 8.dp)
                        .offset(y = 6.dp),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(45.dp),
                    placeholder = {
                        Text(text = "Digite seu email",
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF808080),
                            fontSize = 10.sp
                        )
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = colorResource(id = R.color.black),
                        focusedBorderColor = colorResource(id = R.color.black)
                    ),
                    shape = RoundedCornerShape(16.dp),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Senha",
                    modifier = Modifier
                        .padding(bottom = 8.dp)
                        .offset(y = 6.dp),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black)

                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(45.dp),
                    placeholder = {
                        Text(
                            text = "Digite sua senha",
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF808080),
                            fontSize = 10.sp
                        )
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = colorResource(id = R.color.black),
                        focusedBorderColor = colorResource(id = R.color.black)
                    ),
                    shape = RoundedCornerShape(16.dp),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
                )
                Spacer(modifier = Modifier.height(14.dp))
                Button(
                    onClick = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(40.dp),
                    shape = RoundedCornerShape(16.dp),
                    colors = ButtonDefaults.buttonColors(Color.Red)
                ) {
                    Text(
                        text = "Entrar",
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        fontSize = 16.sp
                    )
                }
                Spacer(modifier = Modifier.height(6.dp))
                Surface(onClick = {},
                    modifier = Modifier
                        .padding(horizontal = 30.dp)
                        .align(Alignment.End)
                        .offset(x = 14.dp, y = -6.dp)
                ) {
                    Text(
                        text = "Esqueceu sua senha?",
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFFDC143C),
                        fontSize = 12.sp,
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(100.dp))
        Row (
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
        ){
            Surface(
                onClick = {},
                modifier = Modifier
                    .offset(x = -30.dp),
                shape = CircleShape
            ) {
                Column {
                    Image(
                        painter = painterResource(id = R.drawable.google),
                        contentDescription = "Imagem de icone google",
                        modifier = Modifier
                            .size(50.dp)
                    )
                }
            }
            Surface(onClick = {},
                modifier = Modifier,
                shape = CircleShape
            ) {
                Column {
                    Image(
                        painter = painterResource(id = R.drawable.facebook),
                        contentDescription = "Imagem de icone facebook",
                        modifier = Modifier
                            .size(50.dp)
                    )
                }
            }
            Surface(onClick = {},
                modifier = Modifier
                    .offset(x = 30.dp),
                shape = CircleShape
            ) {
                Column {
                    Image(
                        painter = painterResource(id = R.drawable.twitter),
                        contentDescription = "Imagem de icone twitter",
                        modifier = Modifier
                            .size(50.dp)
                    )
                }
            }

        }
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = {},
            modifier = Modifier
                .height(40.dp)
                .align(Alignment.CenterHorizontally),
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(Color.White)
        ) {
            Text(
                text = "Cadastrar-se",
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp,
                color = Color.Black,
                modifier = Modifier
                    .align(Alignment.CenterVertically)
            )
        }
    }
}


@Preview
@Composable
private fun LoginScreenPreview() {
    LoginScreen()
}