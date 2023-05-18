
package hudson.cli;

import jenkins.model.Jenkins;
import hudson.model.ListView;

Jenkins jenkins = Jenkins.getInstance()


matrixJob('mlp_cluster_compute_time_stamp_main_athna') {
    description('This is an mlp_cluster_compute_time_stamp_main_athna Job DSL job')
       axes {
           axis {
                 name('corpId')
                 valueString('ALL')
                }
      
        }


    steps {
        shell('echo "Im mlp_cluster_compute_time_stamp_main_athna"')
    }
            publishers {
              downstream('bt_nodes_decrease')
              downstream('delete_data_proc_cluster')
                   }
                             
myView = hudson.model.Hudson.instance.getView('Athna')
myView.doAddJobToView('mlp_cluster_compute_time_stamp_main_athna') 
jenkins.save()

}
