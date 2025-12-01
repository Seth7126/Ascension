// 函数: sub_1a4874
// 地址: 0x1a4874
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0
void** r2
r0, r2 = sub_19e5e0(arg1, "Ts", 0x1d0629)
char const* const r8
char const* const r9

if (r0 == 0)
    int32_t r0_3
    r0_3, r2 = sub_19e5e0(arg1, "Tu", 0x1d0633)
    
    if (r0_3 == 0)
        int32_t r0_5
        r0_5, r2 = sub_19e5e0(arg1, "Te", 0x1d063c)
        
        if (r0_5 == 0)
            r9 = nullptr
            r8 = nullptr
        else
            r8 = &data_1d063d[4]
            r9 = "enum"
    else
        r8 = &data_1d0634[5]
        r9 = "union"
else
    r8 = &data_1d062a[6]
    r9 = "struct"

struct (anonymous namespace)::Node::(anonymous namespace)::ElaboratedTypeSpefType::VTable** r5 =
    nullptr
void* r0_7 = sub_19f4bc(arg1, nullptr, r2)

if (r0_7 != 0)
    if (r9 == r8)
        return r0_7
    
    r5 = sub_19fbde(&arg1[0x5c], 0x14)
    *r5 = &
        _vtable_for_(anonymous namespace)::ElaboratedTypeSpefType{for `(anonymous namespace)::Node'}
    r5[1] = 0x1010106
    r5[2] = r9
    r5[3] = r8
    r5[4] = r0_7

return r5
