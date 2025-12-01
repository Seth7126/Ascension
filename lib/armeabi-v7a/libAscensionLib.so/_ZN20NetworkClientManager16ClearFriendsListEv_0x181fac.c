// 函数: _ZN20NetworkClientManager16ClearFriendsListEv
// 地址: 0x181fac
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* entry_r0
int32_t result = *(entry_r0 + 0x514)
int32_t r1 = *(entry_r0 + 0x518)

if (r1 != result)
    int32_t r5_1 = (r1 - result) s>> 2
    int32_t r6_1 = 0
    
    while (true)
        void* r0 = *(result + (r6_1 << 2))
        
        if (r0 != 0)
            operator delete(r0)
        
        r6_1 += 1
        
        if (r6_1 u>= r5_1)
            break
        
        result = *(entry_r0 + 0x514)
    
    result = *(entry_r0 + 0x514)

*(entry_r0 + 0x518) = result
return result
