package com.user

import grails.plugin.springsecurity.annotation.Secured


class SecureController {
   @Secured(['ROLE_USER','ROLE_ADMIN'])
   // @Secured('ROLE_ADMIN')
    def index() {

        render view:  'menu'

    }
}

