(function(){"use strict";var e={1840:function(e,n,t){var r=t(5130),o=(t(8077),t(973));const i=[{path:"/",name:"Home",component:()=>t.e(559).then(t.bind(t,3559))},{path:"/question/list",name:"Question List",component:()=>Promise.all([t.e(757),t.e(570)]).then(t.bind(t,5570))},{path:"/co2view/list",name:"CO2 Data",component:()=>Promise.all([t.e(757),t.e(641)]).then(t.bind(t,2641))}],a=(0,o.aE)({history:(0,o.LA)(),routes:i});var u=t(6768),c=t(4232),s=t(144);const l={id:"app"},f={id:"title"},d={class:"navbar navbar-expand navbar-success bg-success"},v={class:"navbar-nav mr-auto"},p={class:"nav-item"},h={class:"nav-item"},m={class:"nav-item"},b={class:"container mt-3"};var g={__name:"App",setup(e){const n=(0,s.KR)("Sfarm");return(e,t)=>{const r=(0,u.g2)("router-link"),o=(0,u.g2)("router-view");return(0,u.uX)(),(0,u.CE)("div",l,[(0,u.Lk)("header",null,[(0,u.Lk)("h1",f,(0,c.v_)(n.value),1)]),(0,u.Lk)("nav",d,[(0,u.bF)(r,{to:"/",class:"navbar-brand text-light"},{default:(0,u.k6)((()=>[(0,u.eW)("Home")])),_:1}),(0,u.Lk)("div",v,[(0,u.Lk)("li",p,[(0,u.bF)(r,{to:"/question/list",class:"nav-link text-light"},{default:(0,u.k6)((()=>[(0,u.eW)("QLIST")])),_:1})]),(0,u.Lk)("li",h,[(0,u.bF)(r,{to:"/question/add",class:"nav-link text-light"},{default:(0,u.k6)((()=>[(0,u.eW)("QAdd")])),_:1})]),(0,u.Lk)("li",m,[(0,u.bF)(r,{to:"/co2view/list",class:"nav-link text-light"},{default:(0,u.k6)((()=>[(0,u.eW)("CO2Data")])),_:1})])])]),(0,u.Lk)("div",b,[(0,u.bF)(o)])])}}};const k=g;var y=k;const w=(0,r.Ef)(y);w.use(a),w.mount("#app")}},n={};function t(r){var o=n[r];if(void 0!==o)return o.exports;var i=n[r]={exports:{}};return e[r].call(i.exports,i,i.exports,t),i.exports}t.m=e,function(){var e=[];t.O=function(n,r,o,i){if(!r){var a=1/0;for(l=0;l<e.length;l++){r=e[l][0],o=e[l][1],i=e[l][2];for(var u=!0,c=0;c<r.length;c++)(!1&i||a>=i)&&Object.keys(t.O).every((function(e){return t.O[e](r[c])}))?r.splice(c--,1):(u=!1,i<a&&(a=i));if(u){e.splice(l--,1);var s=o();void 0!==s&&(n=s)}}return n}i=i||0;for(var l=e.length;l>0&&e[l-1][2]>i;l--)e[l]=e[l-1];e[l]=[r,o,i]}}(),function(){t.n=function(e){var n=e&&e.__esModule?function(){return e["default"]}:function(){return e};return t.d(n,{a:n}),n}}(),function(){t.d=function(e,n){for(var r in n)t.o(n,r)&&!t.o(e,r)&&Object.defineProperty(e,r,{enumerable:!0,get:n[r]})}}(),function(){t.f={},t.e=function(e){return Promise.all(Object.keys(t.f).reduce((function(n,r){return t.f[r](e,n),n}),[]))}}(),function(){t.u=function(e){return"js/"+e+"."+{559:"fda208e8",570:"abe330f7",641:"4cc4c552",757:"957d5d5a"}[e]+".js"}}(),function(){t.miniCssF=function(e){return"css/"+e+"."+{559:"a73efc35",641:"56c12ad7"}[e]+".css"}}(),function(){t.g=function(){if("object"===typeof globalThis)return globalThis;try{return this||new Function("return this")()}catch(e){if("object"===typeof window)return window}}()}(),function(){t.o=function(e,n){return Object.prototype.hasOwnProperty.call(e,n)}}(),function(){var e={},n="frontend:";t.l=function(r,o,i,a){if(e[r])e[r].push(o);else{var u,c;if(void 0!==i)for(var s=document.getElementsByTagName("script"),l=0;l<s.length;l++){var f=s[l];if(f.getAttribute("src")==r||f.getAttribute("data-webpack")==n+i){u=f;break}}u||(c=!0,u=document.createElement("script"),u.charset="utf-8",u.timeout=120,t.nc&&u.setAttribute("nonce",t.nc),u.setAttribute("data-webpack",n+i),u.src=r),e[r]=[o];var d=function(n,t){u.onerror=u.onload=null,clearTimeout(v);var o=e[r];if(delete e[r],u.parentNode&&u.parentNode.removeChild(u),o&&o.forEach((function(e){return e(t)})),n)return n(t)},v=setTimeout(d.bind(null,void 0,{type:"timeout",target:u}),12e4);u.onerror=d.bind(null,u.onerror),u.onload=d.bind(null,u.onload),c&&document.head.appendChild(u)}}}(),function(){t.r=function(e){"undefined"!==typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(e,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(e,"__esModule",{value:!0})}}(),function(){t.p="/"}(),function(){if("undefined"!==typeof document){var e=function(e,n,r,o,i){var a=document.createElement("link");a.rel="stylesheet",a.type="text/css",t.nc&&(a.nonce=t.nc);var u=function(t){if(a.onerror=a.onload=null,"load"===t.type)o();else{var r=t&&t.type,u=t&&t.target&&t.target.href||n,c=new Error("Loading CSS chunk "+e+" failed.\n("+r+": "+u+")");c.name="ChunkLoadError",c.code="CSS_CHUNK_LOAD_FAILED",c.type=r,c.request=u,a.parentNode&&a.parentNode.removeChild(a),i(c)}};return a.onerror=a.onload=u,a.href=n,r?r.parentNode.insertBefore(a,r.nextSibling):document.head.appendChild(a),a},n=function(e,n){for(var t=document.getElementsByTagName("link"),r=0;r<t.length;r++){var o=t[r],i=o.getAttribute("data-href")||o.getAttribute("href");if("stylesheet"===o.rel&&(i===e||i===n))return o}var a=document.getElementsByTagName("style");for(r=0;r<a.length;r++){o=a[r],i=o.getAttribute("data-href");if(i===e||i===n)return o}},r=function(r){return new Promise((function(o,i){var a=t.miniCssF(r),u=t.p+a;if(n(a,u))return o();e(r,u,null,o,i)}))},o={524:0};t.f.miniCss=function(e,n){var t={559:1,641:1};o[e]?n.push(o[e]):0!==o[e]&&t[e]&&n.push(o[e]=r(e).then((function(){o[e]=0}),(function(n){throw delete o[e],n})))}}}(),function(){var e={524:0};t.f.j=function(n,r){var o=t.o(e,n)?e[n]:void 0;if(0!==o)if(o)r.push(o[2]);else{var i=new Promise((function(t,r){o=e[n]=[t,r]}));r.push(o[2]=i);var a=t.p+t.u(n),u=new Error,c=function(r){if(t.o(e,n)&&(o=e[n],0!==o&&(e[n]=void 0),o)){var i=r&&("load"===r.type?"missing":r.type),a=r&&r.target&&r.target.src;u.message="Loading chunk "+n+" failed.\n("+i+": "+a+")",u.name="ChunkLoadError",u.type=i,u.request=a,o[1](u)}};t.l(a,c,"chunk-"+n,n)}},t.O.j=function(n){return 0===e[n]};var n=function(n,r){var o,i,a=r[0],u=r[1],c=r[2],s=0;if(a.some((function(n){return 0!==e[n]}))){for(o in u)t.o(u,o)&&(t.m[o]=u[o]);if(c)var l=c(t)}for(n&&n(r);s<a.length;s++)i=a[s],t.o(e,i)&&e[i]&&e[i][0](),e[i]=0;return t.O(l)},r=self["webpackChunkfrontend"]=self["webpackChunkfrontend"]||[];r.forEach(n.bind(null,0)),r.push=n.bind(null,r.push.bind(r))}();var r=t.O(void 0,[504],(function(){return t(1840)}));r=t.O(r)})();
//# sourceMappingURL=app.e4160afc.js.map