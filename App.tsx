import { View, Text,NativeModules, Pressable } from 'react-native'
import React from 'react'

const App = () => {
const {MyDemoProject}=NativeModules

const myapp=()=>{
  MyDemoProject.myProject("neha asthana",(err,message)=>{
    
      alert(`message: ${message}`)
   
  })
}
const toastmsg=()=>{
  MyDemoProject.showToastMessage()
}
  return (
    <View>
      <Pressable onPress={()=>myapp()}>
      <Text>App</Text>
      </Pressable>
      <View>
      <Pressable onPress={()=>toastmsg()}>
      <Text>Toast message</Text>
      </Pressable>
      </View>
    </View>
    
  )
}

export default App

