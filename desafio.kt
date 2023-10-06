enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(val nome: String, val idade: Int)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val conteudos: MutableList<ConteudoEducacional>) {

    val inscritos: MutableList<Usuario> = mutableListOf()
    
    fun matricular(usuario: Usuario) {
       inscritos.add(usuario)
       val informacaoAluno = usuario.toString()
        println("$informacaoAluno matriculado(a) em $nome. Alunos matriculados: $inscritos")
    }
     
    fun mostrarConteudos() {
        val numConteudos = conteudos.size
        
        println("$nome contem ao todo $numConteudos conteudo(s), sendo eles: $conteudos")
        
    }
    
}

fun main() {

val programacaoWeb = Formacao("Programação Web", mutableListOf(ConteudoEducacional("Redes")))

val pedro = Usuario("Pedro", 19)
val antonio = Usuario("Antônio", 21)


programacaoWeb.matricular(pedro)
programacaoWeb.matricular(antonio)



val Python = ConteudoEducacional("Python", 10)
val redesNeurais = ConteudoEducacional("Redes Neurais", 15)

val iA = Formacao("Inteligência Artificial", mutableListOf(Python, redesNeurais))



iA.matricular(Usuario("Sabrina", 30))
iA.matricular(Usuario("José", 32))

programacaoWeb.mostrarConteudos()
iA.mostrarConteudos()

}