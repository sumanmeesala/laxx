
job('Athna_cc_trigger') {
    description('This is an Athna_cc_trigger Job DSL job')


    steps {
        shell('echo "Im Athna_cc_trigger"')
    }
        publishers {
              downstream('ou_substitution_b_m_athna')
                   }
}

