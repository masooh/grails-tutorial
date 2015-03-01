package intro

class HelloController {

    def index() {
        println params.what
        println params.whom
        println params
        render view: '/hello/index', model: params
    }
}