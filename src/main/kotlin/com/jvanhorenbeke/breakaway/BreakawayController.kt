package com.jvanhorenbeke.breakaway

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class BreakawayController {

    @GetMapping("/greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String) =
            Greeting("Hello, $name")

    @GetMapping("/sprinters/{clubId}/{year}")
    fun sprinters(@PathVariable("clubId") clubId: String, @PathVariable("year") year: Long) =
            "sprinters"

    @GetMapping("/radius/{clubId}/{year}")
    fun radius(@PathVariable("clubId") clubId: String, @PathVariable("year") year: Long) =
            "radius"

    @GetMapping("/polka/{clubId}/{year}")
    fun polka(@PathVariable("clubId") clubId: String, @PathVariable("year") year: Long) =
            "polka"

    @GetMapping("/general/{clubId}/{year}")
    fun general(@PathVariable("clubId") clubId: String, @PathVariable("year") year: Long) =
            "general"
}