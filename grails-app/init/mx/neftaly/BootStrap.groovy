package mx.neftaly

import mx.neftaly.bookseller.Authority
import mx.neftaly.bookseller.Person
import mx.neftaly.bookseller.PersonAuthority

class BootStrap {

    def init = { servletContext ->
        def admin = new Person(username: 'admin', password: 'test').save()
        def adminRole = new Authority(authority: "ROLE_ADMIN").save()
        PersonAuthority.create(admin, adminRole, true)
    }
    def destroy = {
    }
}
