matrixJob('mlp_cluster_compute_time_stamp_main_athena') {
    description('This is an mlp_cluster_compute_time_stamp_main_athena Job DSL job')
       axes {
           axis {
                 name('corpId')
                 valueString('ALL')
                }
      
        }
    scm {
        git('https://github.com/sumanmeesala/laxx.git')
    }

    steps {
        shell('echo "Im mlp_cluster_compute_time_stamp_main_athena"')
    }
            publishers {
              downstream('bt_nodes_decrease')
              downstream('delete_data_proc_cluster')
                   }
}
