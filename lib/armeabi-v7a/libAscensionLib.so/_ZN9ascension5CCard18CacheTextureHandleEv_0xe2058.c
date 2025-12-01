// 函数: _ZN9ascension5CCard18CacheTextureHandleEv
// 地址: 0xe2058
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void* entry_r0
int32_t r5_1

if (zx.d(*(entry_r0 + 0x188)) != 0)
    r5_1 = 0

if (zx.d(*(entry_r0 + 0x188)) == 0 || zx.d(*(entry_r0 + 0x230)) == 0)
    int32_t r0_3 = *(entry_r0 + 0x8c)
    char var_5c
    void* r0_6
    
    if (r0_3 == 0)
        r0_6 = &var_5c
    else
        void* r0_4
        
        if ((r0_3 & 2) == 0)
            if ((r0_3 & 4) == 0)
                if ((r0_3 & 8) == 0)
                    if ((r0_3 & 0x10) != 0)
                        r0_4 = &(*"none")[4 << 4]
                    else
                        r0_4 = "none"
                else
                    r0_4 = &(*"none")[3 << 4]
            else
                r0_4 = &(*"none")[2 << 4]
        else
            r0_4 = &(*"none")[1 << 4]
        
        var_5c = *r0_4
        void var_5b
        r0_6 = &var_5b
    
    int32_t r2_1 = *(entry_r0 + 0x88)
    *(r0_6 + 1) = 0x5f
    *r0_6 = (*"none")[r2_1 << 4]
    strcpy(r0_6 + 2, entry_r0 + 4)
    r5_1 = ChecksumStringI(&var_5c)

int32_t r0_12

if ((zx.d(*(entry_r0 + 0x188)) == 0 || zx.d(*(entry_r0 + 0x230)) == 0)
        && zx.d(*(entry_r0 + 0x188)) == 0)
    *(entry_r0 + 0x1cc) = 0
    *(entry_r0 + 0x1d0) = 0
    r0_12 = r5_1
    *(entry_r0 + 0x1d4) = 0x3f800000
    *(entry_r0 + 0x1d8) = 0x3f800000
else
    r0_12 = ChecksumStringI(entry_r0 + 0x188)

bool cond:0 = zx.d(*(entry_r0 + 0x1dc)) == 0
*(entry_r0 + 0x1c8) = r0_12
int32_t r0_14

if (cond:0)
    *(entry_r0 + 0x220) = 0
    *(entry_r0 + 0x224) = 0
    r0_14 = r5_1
    *(entry_r0 + 0x228) = 0x3f800000
    *(entry_r0 + 0x22c) = 0x3f800000
else
    r0_14 = ChecksumStringI(entry_r0 + 0x1dc)

bool cond:1 = zx.d(*(entry_r0 + 0x230)) == 0
*(entry_r0 + 0x21c) = r0_14
int32_t r0_16

if (cond:1)
    *(entry_r0 + 0x274) = 0
    *(entry_r0 + 0x278) = 0
    r0_16 = r5_1
    *(entry_r0 + 0x27c) = 0x3f800000
    *(entry_r0 + 0x280) = 0x3f800000
else
    r0_16 = ChecksumStringI(entry_r0 + 0x230)

bool cond:2 = zx.d(*(entry_r0 + 0x284)) == 0
*(entry_r0 + 0x270) = r0_16
int32_t r0_18

if (cond:2)
    *(entry_r0 + 0x2c8) = 0
    *(entry_r0 + 0x2cc) = 0
    r0_18 = r5_1
    *(entry_r0 + 0x2d0) = 0x3f800000
    *(entry_r0 + 0x2d4) = 0x3f800000
else
    r0_18 = ChecksumStringI(entry_r0 + 0x284)

bool cond:3 = zx.d(*(entry_r0 + 0x2d8)) == 0
*(entry_r0 + 0x2c4) = r0_18

if (cond:3)
    *(entry_r0 + 0x31c) = 0
    *(entry_r0 + 0x320) = 0
    *(entry_r0 + 0x324) = 0x3f800000
    *(entry_r0 + 0x328) = 0x3f800000
else
    r5_1 = ChecksumStringI(entry_r0 + 0x2d8)

*(entry_r0 + 0x318) = r5_1
int32_t r0_21 = *__stack_chk_guard

if (r0_21 == r0)
    return r0_21 - r0

__stack_chk_fail()
noreturn
