package hudson.cli;

import jenkins.model.Jenkins;
import hudson.model.ListView;

Jenkins jenkins = Jenkins.getInstance()

matrixJob('bt_nodes_decrease') {
    description('This is an bt_nodes_decrease Job DSL job')
    
   axes {
           axis {
                 name('corpId')
                 valueString(CC_CLIENTS)
                }
      
        }
  


    steps {
        shell('echo "Im bt_nodes_decrease"')
    }
    
myView = hudson.model.Hudson.instance.getView('Athna')
myView.doAddJobToView('bt_nodes_decrease') 
jenkins.save()

}

