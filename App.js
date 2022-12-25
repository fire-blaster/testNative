import { Animated, NativeModules, StyleSheet, Text, TouchableOpacity, useWindowDimensions, View } from 'react-native'
import React, { useRef, useState } from 'react'

const { Metronome } = NativeModules;
const { Val } = Metronome.getConstants();
// const { test } = Metronome.increase();
// console.log("Test:", test);

const App = () => {
  const [event, setEvent] = useState(0)
  console.log("e:", event);

  const touch = useRef(new Animated.ValueXY({ x: 0, y: 0 })).current
  const dimensions = useWindowDimensions()

  const [val, setVal] = useState(60)



  const play = async () => {

    Metronome.play()
    console.log("Start");
  }
  const stop = () => {
    console.log("Stop");
    // Metronome.stop()
  }

  const increase = async () => {

    const value = await Metronome.increase();
    setVal(value)

  }
  // Metronome.increase()


  // console.log(" jsjsj:", Val);

  const decrease = async () => {
    const value = await Metronome.decrease()
    setVal(value)
  }
  return (
    <View>
      {/* <View style={{
        width: 150,
        height: 150,
        borderRadius: 150 / 2,
        borderWidth: 1,
        borderColor: "red",
        justifyContent: "center"
      }}>
        <View
          style={{
            backgroundColor: "lime",
            width: 148,
            height: 148,
            borderRadius: 148 / 2,
            opacity: 0.3,
            transform: [{
              rotateX: 300
                // String(event) === 0 ?
                //   0
                //   : event?.locationX
                + "deg"
            }, {
              rotateY: 120
                // String(event) === 0 ?
                //   0
                //   : event?.locationY
                + "deg"
            }]
          }}
          // onStartShouldSetResponder={() => true}
          onMoveShouldSetResponder={() => true}
          // onMoveShouldSetResponder={(e) => {
          //   setEvent(e.nativeEvent)
          // }}
          onResponderGrant={e => { true }}
          onResponderMove={(evt) => {
            // console.log("e:", evt.nativeEvent),
            setEvent(evt.nativeEvent)
          }}
          onResponderRelease={(e) => { console.log("e:", e.nativeEvent) }}
        >

          <Animated.View style={{
            position: "absolute",
            alignSelf: "center",
            top: event.locationY,
            left: event?.locationX,
            backgroundColor: "red",
            width: 10,
            height: 10, borderRadius: 5
          }} />
          <Text style={{
            top: 60,

          }}>Hello</Text>
        </View>
      </View> */}
      <TouchableOpacity

        onPress={() => {
          play()
        }}
        style={{ width: 100, height: 40, justifyContent: "center", alignItems: "center", alignSelf: "center", backgroundColor: "lime" }}
      ><Text>Play</Text></TouchableOpacity>
      <TouchableOpacity

        onPress={() => {
          stop()
        }}
        style={{
          width: 100, height: 40, marginTop: 20, justifyContent: "center", alignItems: "center", alignSelf: "center",
          backgroundColor: "red"
        }}
      ><Text>Stop</Text></TouchableOpacity>
      <TouchableOpacity

        onPress={() => {
          increase()
        }}
        style={{
          width: 100, height: 40, marginTop: 20, justifyContent: "center", alignItems: "center", alignSelf: "center",
          backgroundColor: "lime"
        }}
      ><Text>Plus</Text></TouchableOpacity>
      <TouchableOpacity

        onPress={() => {
          decrease()
        }}
        style={{
          width: 100, height: 40, marginTop: 20, justifyContent: "center", alignItems: "center", alignSelf: "center",
          backgroundColor: "lime"
        }}

      ><Text>Minus</Text></TouchableOpacity>
      <Text>{val}</Text>
    </View >
  )
}


export default App

const styles = StyleSheet.create({})