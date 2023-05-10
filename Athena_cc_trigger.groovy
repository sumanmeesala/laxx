job('Athena_cc_trigger') {
    description('This is an Athena_cc_trigger Job DSL job')
    environment {
        key = 'NEWVARIABLE'
        value = 'newvalue'
    }
    scm {
        git('https://github.com/sumanmeesala/laxx.git')
    }

    steps {
        shell('echo "Im Athena_cc_trigger"')
    }
        publishers {
              downstream('ou_substitution_builder_main_athena')
                   }
}
