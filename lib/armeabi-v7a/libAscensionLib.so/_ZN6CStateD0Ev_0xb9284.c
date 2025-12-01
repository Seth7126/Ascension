// 函数: _ZN6CStateD0Ev
// 地址: 0xb9284
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void** entry_r0
int32_t* i_1 = entry_r0[3]
*entry_r0 = _vtable_for_CState + 8

if (i_1 != 0)
    int32_t* i
    
    do
        i = i_1[5]
        
        if (zx.d(i_1[0xb].b) == 0)
            i_1[0xb].b = 1
            (**i_1)()
        else
            (*(*i_1 + 4))()
        
        i_1 = i
    while (i != 0)

int32_t* r0 = entry_r0[9]
entry_r0[3] = 0
entry_r0[4] = 0

if (r0 != 0)
    if (zx.d(r0[0xb].b) == 0)
        r0[0xb].b = 1
        (**r0)()
    else
        (*(*r0 + 4))()

return operator delete(entry_r0) __tailcall
