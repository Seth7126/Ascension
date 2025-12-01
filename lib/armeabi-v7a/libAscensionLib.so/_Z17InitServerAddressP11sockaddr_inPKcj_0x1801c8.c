// 函数: _Z17InitServerAddressP11sockaddr_inPKcj
// 地址: 0x1801c8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (arg1 == 0)
    return 0

*(arg1 + 0xc) = 0
*(arg1 + 8) = 0
*(arg1 + 4) = 0
*arg1 = 2
*(arg1 + 2) = (ror.w(arg3 u>> 0x10, 0x10) << 0x10).w | ror.w(arg3.w, 0x10)

if (isalpha(sx.d(*arg2)) == 0)
    *(arg1 + 4) = inet_addr(arg2)
else
    struct hostent* r0_4 = gethostbyname(arg2)
    
    if (r0_4 != 0)
        *(arg1 + 4) = **r0_4->__offset(0x10).d

return 1
