package furhatos.app.sayagain.flow.main

import furhatos.app.saywhat.Wakeup
import furhatos.app.saywhat.flow.Parent
import furhatos.app.saywhat.flow.main.SayWhat
import furhatos.flow.kotlin.State
import furhatos.flow.kotlin.furhat
import furhatos.flow.kotlin.onResponse
import furhatos.flow.kotlin.state
import furhatos.gestures.Gestures.CloseEyes
import furhatos.gestures.Gestures.OpenEyes


val Standby: State = state(Parent) {
    onEntry {
        furhat.say("In standby mode")
        furhat.gesture(CloseEyes, priority=10)
        furhat.listen(timeout = 50000)
    }
    onResponse<Wakeup>{
        furhat.gesture(OpenEyes, priority=10)
        furhat.say("I am awake")
        furhat.say(it.text)
        goto(SayWhat)
    }
}