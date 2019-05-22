package com.scottlogic.reactivegame.services

import com.microsoft.outlook.ClassFactory
import com.microsoft.outlook.OlItemType
import com.microsoft.outlook._Application
import com.microsoft.outlook._MailItem
import com4j.Com4jObject
import org.springframework.stereotype.Service

@Service
class EmailService {
    fun sendEmail(address: String, body: String) {
        val application: _Application = ClassFactory.createApplication()
        val comObject: Com4jObject = application.createItem(OlItemType.olMailItem)
        try {
            val mailItem: _MailItem = comObject.queryInterface(_MailItem::class.java)
            mailItem.to(address)
            mailItem.subject("Worm World request access link")
            mailItem.body(body)
            mailItem.send()
        } finally {
            comObject.dispose()
        }
    }

    val whitelist: Set<String> = setOf(
            "amehta",
            "abaronetti",
            "ablock",
            "abirch",
            "acarr",
            "adyer",
            "alee",
            "aaspell-clark",
            "cshackle",
            "cgardiner",
            "clee",
            "ddyl",
            "dgorst",
            "dnicholas",
            "dwithers",
            "dlucas",
            "dkrusteva",
            "ddiep",
            "ehield",
            "fbromley",
            "gginghina",
            "hbedford",
            "hgoode",
            "hmumford-turner",
            "hashby-hayter",
            "hsteele",
            "jburton",
            "jvolmut",
            "jhall",
            "jmatthews",
            "jrobinson",
            "jharris",
            "jbickley-wallace",
            "kmackow",
            "klau",
            "lwinkworth",
            "ltaylor",
            "mhigson",
            "mdebeneducci",
            "mcline",
            "mdunsdon",
            "mhooper",
            "masmith",
            "mwise",
            "mridene",
            "nmiles",
            "npappas",
            "ohayes",
            "pdaulby",
            "pshek",
            "rbragg",
            "rgraham",
            "rgarside",
            "rstuart",
            "sgrant",
            "shaswell",
            "simonhall",
            "slaing",
            "shillcox",
            "stennant",
            "sthomson",
            "tyankova",
            "thayden",
            "thull",
            "thall",
            "wsalt")
}