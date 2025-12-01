// 函数: _ZN9ascension19CCardInPlayInstanceD0Ev
// 地址: 0xea730
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void** entry_r0
int32_t* r2 = entry_r0[8]
int32_t* r0 = entry_r0[9]
*entry_r0 = _vtable_for_ascension::CCardInPlayInstance + 8

if (r2 == r0)
    if (r2 != 0)
        entry_r0[9] = r2
        operator delete(r2)
else
    do
        r0 -= 4
        int32_t* r1_1 = *r0
        entry_r0[9] = r0
        
        if (r1_1 != 0)
            (*(*r1_1 + 4))(r1_1)
            r2 = entry_r0[8]
            r0 = entry_r0[9]
    while (r2 != r0)
    
    if (r0 != 0)
        entry_r0[9] = r0
        operator delete(r0)

void* r0_3 = entry_r0[5]

if (r0_3 != 0)
    entry_r0[6] = r0_3
    operator delete(r0_3)

return operator delete(core::CInstance::~CInstance()) __tailcall
