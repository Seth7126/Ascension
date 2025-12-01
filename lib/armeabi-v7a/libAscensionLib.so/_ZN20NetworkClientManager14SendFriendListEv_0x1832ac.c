// 函数: _ZN20NetworkClientManager14SendFriendListEv
// 地址: 0x1832ac
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void* entry_r0
int32_t r0_1 = *(entry_r0 + 0x514)
int32_t r1 = *(entry_r0 + 0x518)

if (r1 != r0_1)
    int32_t r6_1 = (r1 - r0_1) s>> 2
    int32_t r7_1 = 0
    
    while (true)
        void* r0_2 = *(r0_1 + (r7_1 << 2))
        
        if (r0_2 != 0)
            operator delete(r0_2)
        
        r7_1 += 1
        
        if (r7_1 u>= r6_1)
            break
        
        r0_1 = *(entry_r0 + 0x514)
    
    r0_1 = *(entry_r0 + 0x514)

*(entry_r0 + 0x518) = r0_1
int32_t var_20 = 0
int32_t var_24 = 0
int32_t var_28 = 0
int32_t var_2c = 0
int32_t var_30 = 0xbbbbbbbb
int32_t* r0_3 = *(entry_r0 + 4)
(*(*r0_3 + 8))(r0_3, &var_30, 0x14)
int32_t r0_4 = *__stack_chk_guard

if (r0_4 == r0)
    return r0_4 - r0

__stack_chk_fail()
noreturn
