import logo from './logo.svg';
import './App.css';
import axios from "axios";
import {useEffect, useState} from "react";

function App() {
  const [hello, sethello] = useState('');

  useEffect(() => {
    axios.get('api/test')
        .then( res => {
          sethello(res.data);
        })
  }, []);

  return (
    <div className="App">
     백엔드 데이터 : {hello}
    </div>
  );
}

export default App;
