// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName = 'mx.neftaly.bookseller.Person'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'mx.neftaly.bookseller.PersonAuthority'
grails.plugin.springsecurity.authority.className = 'mx.neftaly.bookseller.Authority'
grails.plugin.springsecurity.requestMap.className = 'mx.neftaly.bookseller.Requestmap'
grails.plugin.springsecurity.securityConfigType = 'Requestmap'
grails.plugin.springsecurity.rest.token.storage.gorm.tokenDomainClassName = 'mx.neftaly.bookseller.AuthenticationToken'
grails.plugin.springsecurity.rest.login.endpointUrl = '/login'
grails.plugin.springsecurity.rest.logout.endpointUrl = '/logout'
grails.plugin.springsecurity.rest.token.validation.endpointUrl = '/validate'
grails.plugin.springsecurity.controllerAnnotations.staticRules = [
        [pattern: '/', access: ['permitAll']],
        [pattern: '/error', access: ['permitAll']]
]
grails.plugin.springsecurity.filterChain.chainMap = [
        //Stateless chain
        [
                pattern: '/**',
                filters: 'JOINED_FILTERS,-anonymousAuthenticationFilter,-exceptionTranslationFilter,-authenticationProcessingFilter,-securityContextPersistenceFilter,-rememberMeAuthenticationFilter'
        ]
]