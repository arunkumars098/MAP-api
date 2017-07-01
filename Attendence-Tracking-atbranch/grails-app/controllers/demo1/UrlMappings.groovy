package demo1

class UrlMappings {
 
    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/api/users"(controller:"user", action:"index", method: "GET")
        "/api/users/$id?"(controller:"user", action:"show", method: "GET")
        "/api/users"(controller:"user", action:"save", method: 'POST')
        "/api/users/$id?"(controller:"user", action:"update", method: 'PUT')
        "/api/users/$id?"(controller:"user", action:"delete", method: 'DELETE')


        "/"( view:"/index")

        "500"(view:'/error')
        "404"(view:'/notFound')

    }
}
