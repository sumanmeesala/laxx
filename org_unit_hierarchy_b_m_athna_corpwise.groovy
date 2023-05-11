


matrixJob('org_unit_hierarchy_b_m_athna_corpwise') {
    description('This is an org_unit_hierarchy_b_m_athna_corpwise Job DSL job')
       axes {
           axis {
                 name('corpId')
                 valueString('ALL')
                }
      
        }


    steps {
        shell('echo "Im org_unit_hierarchy_b_m_athna_corpwise"')
    }
            publishers {
              downstream('employee_dim_attributes_b_m_athna')
                   }
}

