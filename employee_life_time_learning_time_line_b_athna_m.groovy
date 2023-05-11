


matrixJob('employee_life_time_learning_time_line_builder_athna_main') {
    description('This is an employee_life_time_learning_time_line_builder_athna_main Job DSL job')
       axes {
           axis {
                 name('corpId')
                 valueString(CC_CLIENTS)
                }
      
        }


    steps {
        shell('echo "Im employee_life_time_learning_time_line_builder_athna_main"')
    }
            publishers {
              downstream('employee_transition_timeline_b_m_athna')
                   }
}

