


matrixJob('course_subject_bloom_filter_b_m') {
    description('This is an course_subject_bloom_filter_b_m Job DSL job')
       axes {
           axis {
                 name('corpId')
                 valueString('ALL')
                }
      
        }


    steps {
        shell('echo "Im course_subject_bloom_filter_b_m"')
    }
        
}

