package main

import spock.lang.Specification

class FortyTwoSpec extends Specification {

    def "test forty two"() {
        expect:
        43 == 42
    }
}
