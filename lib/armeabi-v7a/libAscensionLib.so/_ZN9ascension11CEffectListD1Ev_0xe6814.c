// 函数: _ZN9ascension11CEffectListD1Ev
// 地址: 0xe6814
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* entry_r0
void* r5 = *(entry_r0 + 4)
int32_t r1 = *(entry_r0 + 8)

if (r5 != r1)
    do
        void* r0 = *(r5 + 4)
        
        if (r0 != 0)
            operator delete(r0)
            r1 = *(entry_r0 + 8)
        
        r5 += 8
    while (r5 != r1)
    
    r5 = *(entry_r0 + 4)

if (r5 != 0)
    *(entry_r0 + 8) = r5
    operator delete(r5)
