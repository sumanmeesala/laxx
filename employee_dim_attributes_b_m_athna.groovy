


matrixJob('employee_dim_attributes_b_m_athna') {
    description('This is an employee_dim_attributes_b_m_athna Job DSL job')
       axes {
           axis {
                 name('corpId')
                 valueString(CC_CLIENTS)
                }
      
        }


    steps {
        shell('echo "Im employee_dim_attributes_b_m_athna"')
    }
            publishers {
              downstream('course_time_line_b_athna_m')
                   }
}

