
class ForwController {

    def index() {
        render text: 'hi' + params.qqq
    }

    def index2() {
        forward(action: 'index', params: [ qqq : 1 ])
    }
}
