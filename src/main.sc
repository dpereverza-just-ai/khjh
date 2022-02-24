require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /hjhj
    
    theme: /ds

    state: Start
        q!: $regex</start>
        a: Empecemos.ваваhshfj

    state: Hello
        intent!: /hello
        a: Hola

    state: Bye
        intent!: /bye
        a: Empecemos1.

    state: NoMatch
        event!: noMatch
        a: No entiendo. tu dijiste: {{$request.query}}

#  state: Start
#         q!: $regex</start>
#         a: Empecemos.

# state: Hello
#     intent!: /hello
#     a: Hola

# state: Bye
#     intent!: /bye
#     a: Empecemos.