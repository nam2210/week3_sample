package com.hnam.exerciseweek3

/**
 * Created by nampham on 3/10/18.
 */

class Profile {
    var name: String? = null
    var email: String? = null

    override fun toString(): String {
        return "Profile{" +
                "name='" + name + '\''.toString() +
                ", email='" + email + '\''.toString() +
                '}'.toString()
    }
}
