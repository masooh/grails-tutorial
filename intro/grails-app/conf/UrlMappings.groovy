class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/say-hello" (controller: 'hello')

        "/"(view:"/index")
        "500"(view:'/error')
	}
}
