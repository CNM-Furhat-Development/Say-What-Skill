package furhatos.app.saywhat.flow.main

import furhatos.app.sayagain.flow.main.Standby
import furhatos.app.saywhat.CNM
import furhatos.app.saywhat.Sleep
import furhatos.app.saywhat.Wakeup
import furhatos.app.saywhat.flow.Parent
import furhatos.flow.kotlin.State
import furhatos.flow.kotlin.furhat
import furhatos.flow.kotlin.onResponse
import furhatos.flow.kotlin.state

val SayWhat: State = state(Parent) {
    onEntry {
        furhat.ask("Repeat after me. CNM")
    }
    onResponse<CNM>{
        furhat.say("I matched your intent to CNM")
        furhat.say(it.text)
        goto(Idle)
    }
    onResponse<Sleep>{
        furhat.say("I will take a nap")
        furhat.say(it.text)
        goto(Standby)
    }
    onResponse<Wakeup>{
        furhat.say("I am awake")
        furhat.say(it.text)
        goto(Idle)
    }
    onResponse {
        furhat.say(it.text)
        logResponse(it.text)
        delay(2000)
        goto(Idle)
    }
}
