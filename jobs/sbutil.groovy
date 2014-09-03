job {
    name 'SButil'
    description 'This is the sbutil helpful java library'
    concurrentBuild true
    scm {
        github('https://github.com/statsbiblioteket/sbutil')
    }
    triggers {
        githubPush()
        scm('*/15 * * * *')
    }
    jdk 'java7'
    steps {
        maven('-e clean test')
    }
}


