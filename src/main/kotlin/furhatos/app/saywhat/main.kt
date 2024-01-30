package furhatos.app.saywhat

import furhatos.app.saywhat.flow.Init
import furhatos.flow.kotlin.Flow
import furhatos.skills.Skill

class SaywhatSkill : Skill() {
    override fun start() {
        Flow().run(Init)
    }
}

fun main(args: Array<String>) {
    Skill.main(args)
}
