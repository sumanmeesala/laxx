


matrixJob('subject_recommendations_nc_b_m') {
    description('This is an subject_recommendations_nc_b_m Job DSL job')
       axes {
           axis {
                 name('corpId')
                 valueString(CC_CLIENTS)
                }
      
        }

    steps {
        shell('echo "Im subject_recommendations_nc_b_m"')
    }
            publishers {
              downstream('course_playlist_accumulated_bloom_filter_b_m')
              downstream('course_subject_bloom_filter_b_m')
                   }
}

