// 函数: _ZN4core11CPlayerBaseD1Ev
// 地址: 0xb73d4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void** entry_r0
uint32_t r1 = zx.d(entry_r0[0xd].b)
*entry_r0 = _vtable_for_core::CPlayerBase + 8

if (r1 != 0)
    int32_t* r0_1 = entry_r0[0xc]
    
    if (r0_1 != 0)
        (*(*r0_1 + 0xc))()
        int32_t* r0_4 = entry_r0[0xc]
        
        if (r0_4 != 0)
            (*(*r0_4 + 4))()

return core::CInstance::~CInstance() __tailcall
