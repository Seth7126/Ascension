// 函数: _ZN9ascension18CConstructInstanceD0Ev
// 地址: 0xe4e94
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void** entry_r0
int32_t* r2 = entry_r0[0xf]
int32_t* r0 = entry_r0[0x10]
*entry_r0 = _vtable_for_ascension::CConstructInstance + 8

if (r2 == r0)
    r0 = r2
else
    do
        r0 -= 4
        int32_t* r1_1 = *r0
        entry_r0[0x10] = r0
        
        if (r1_1 != 0)
            (*(*r1_1 + 4))(r1_1)
            r2 = entry_r0[0xf]
            r0 = entry_r0[0x10]
    while (r2 != r0)

void* r1_2 = entry_r0[0x12]

if (r1_2 != 0)
    entry_r0[0x13] = r1_2
    operator delete(r1_2)
    r0 = entry_r0[0xf]

if (r0 != 0)
    entry_r0[0x10] = r0
    operator delete(r0)

return operator delete(ascension::CCardInPlayInstance::~CCardInPlayInstance()) __tailcall
