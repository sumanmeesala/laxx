


matrixJob('course_lineage_athna_b_m') {
    description('This is an course_lineage_athna_b_m Job DSL job')
       axes {
           axis {
                 name('corpId')
                 valueString(CC_CLIENTS)
                }
      
        }


    steps {
        shell('echo "Im course_lineage_athna_b_m"')
    }
            publishers {
              downstream('user_lo_latest_lo_version_substitution_b_m_athna')
                   }
}

