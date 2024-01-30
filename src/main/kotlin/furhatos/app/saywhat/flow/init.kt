package furhatos.app.saywhat.flow

import furhatos.app.saywhat.flow.main.Idle
import furhatos.app.saywhat.flow.main.SayWhat
import furhatos.app.saywhat.setting.DISTANCE_TO_ENGAGE
import furhatos.app.saywhat.setting.MAX_NUMBER_OF_USERS
import furhatos.flow.kotlin.State
import furhatos.flow.kotlin.furhat
import furhatos.flow.kotlin.state
import furhatos.flow.kotlin.users

val Init: State = state {
    init {
        /** Set our default interaction parameters */
        users.setSimpleEngagementPolicy(DISTANCE_TO_ENGAGE, MAX_NUMBER_OF_USERS)
    }
    onEntry {
        /** start interaction */
        when {
            furhat.isVirtual() -> goto(SayWhat) // Convenient to bypass the need for user when running Virtual Furhat
            users.hasAny() -> {
                furhat.attend(users.random)
                goto(SayWhat)
            }
            else -> goto(Idle)
        }
    }

}
