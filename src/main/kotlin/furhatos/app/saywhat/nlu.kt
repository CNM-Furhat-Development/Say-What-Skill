package furhatos.app.saywhat
import furhatos.nlu.EnumEntity
import furhatos.nlu.Intent
import furhatos.util.Language


class CNM : EnumEntity(speechRecPhrases=true) {

    override fun getEnum(lang: Language): List<String> {
        return listOf("synonym", "singing them", "send a", "Sycamore", "C & M","sit on them","sing","c n n")
    }
}
class Sleep : Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf("Relax", "Take a break","sleep","shut up")
    }
}
class Wakeup : Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf("Hello", "Wake Up", "Let's go")
    }
}