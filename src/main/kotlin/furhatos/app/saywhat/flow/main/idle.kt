package furhatos.app.saywhat.flow.main

import furhatos.flow.kotlin.State
import furhatos.flow.kotlin.furhat
import furhatos.flow.kotlin.onUserEnter
import furhatos.flow.kotlin.state

val Idle: State = state {
    onEntry {
        //furhat.attendNobody()
        goto(SayWhat)
    }

    onUserEnter {
        furhat.attend(it)
        goto(SayWhat)
    }

}
