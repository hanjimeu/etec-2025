                                                       package com.example.diceroller

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
// Imports do Compose para customizar a aparência e o posicionamento dos elementos.
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
// Import para acessar os alinhamentos, como o central.
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
// Import que habilita a pré-visualização do layout no editor.
import androidx.compose.ui.tooling.preview.Preview
import com.example.diceroller.ui.theme.DiceRollerTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DiceRollerTheme {
                // Inicia a renderização do nosso componente principal na tela.
                DiceRollerApp()
            }
        }
    }
}

// @Composable: Marca esta função como um componente de interface gráfica do Compose.
// @Preview: Permite que o Android Studio exiba este componente na janela de Design.
@Preview
@Composable
fun DiceRollerApp() {
    // Invoca nosso layout de dado, passando modificadores para que ele
    // ocupe todo o espaço e alinhe seu conteúdo no centro.
    DiceWithButtonAndImage(
        modifier = Modifier
            .fillMaxSize() // Garante que o layout use toda a tela.
            .wrapContentSize(Alignment.Center) // Posiciona o conteúdo no meio.
    )
}

// Este componente é responsável por mostrar a imagem do dado e o botão de rolagem.
// O 'modifier' permite que quem chama esta função possa customizar seu layout.
@Composable
fun DiceWithButtonAndImage(modifier: Modifier = Modifier) {
    // Cria uma variável de estado para guardar o número do dado.
    // 'remember' evita que o valor se perca quando a tela for redesenhada.
    // 'mutableStateOf(1)' define o valor inicial como 1 e torna a variável "observável".
    var result by remember { mutableStateOf(1) }

    // Escolhe a imagem correta para exibir com base no valor atual de 'result'.
    val imageResource = when (result) {
        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        else -> R.drawable.dice_6
    }

    // A 'Column' empilha os elementos na vertical (um sobre o outro).
    Column(
        modifier = modifier, // Aplica os modificadores recebidos (tela cheia, centralizado).
        horizontalAlignment = Alignment.CenterHorizontally // Alinha os itens internos no centro horizontal.
    ) {

        // Elemento que exibe a imagem selecionada.
        Image(
            painter = painterResource(imageResource), // Define qual imagem carregar.
            contentDescription = result.toString()    // Texto alternativo para acessibilidade.
        )

        // Cria um espaço vertical de 16dp para separar a imagem do botão.
        Spacer(modifier = Modifier.height(16.dp))

        // Cria o botão de interação.
        Button(
            // A ação a ser executada no clique: sortear um número e atualizar o 'result'.
            onClick = { result = (1..6).random() }
        ) {
            // Define o texto que aparecerá dentro do botão.
            // 'stringResource' busca o texto de R.string.roll para facilitar a tradução.
            Text(stringResource(R.string.roll))
        }
    }
}