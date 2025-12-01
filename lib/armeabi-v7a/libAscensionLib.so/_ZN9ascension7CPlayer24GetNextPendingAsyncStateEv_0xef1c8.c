// 函数: _ZN9ascension7CPlayer24GetNextPendingAsyncStateEv
// 地址: 0xef1c8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* entry_r0
int32_t* r6 = *(entry_r0 + 0x78)
int32_t r0 = *(entry_r0 + 0x7c)

if (r6 == r0)
    return 0

int32_t result = *r6

if (r0 != &r6[1])
    __aeabi_memmove4(r6)

*(entry_r0 + 0x7c) = &r6[(r0 - &r6[1]) s>> 2]
return result
