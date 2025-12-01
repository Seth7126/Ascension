// 函数: _ZN9ascension6CWorld24GetRandomHeroOrConstructEv
// 地址: 0xf6d74
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* entry_r0
int32_t* r5_1 = &entry_r0[0x2b5]
int32_t r7_1 = entry_r0[0x2b6] - *r5_1
int32_t r8 = (entry_r0[0x2b9] - entry_r0[0x2b8]) s>> 2
int32_t r0_2 = (*(*entry_r0 + 0xc))(entry_r0, r8 + (r7_1 s>> 2))

if (r0_2 u< r7_1 s>> 2)
    *(*r5_1 + (r0_2 << 2))
else
    r0_2 -= r7_1 s>> 2
    
    if (r0_2 u< r8)
        *(entry_r0[0x2b8] + (r0_2 << 2))

return ascension::CWorld::CreateCard(entry_r0) __tailcall
