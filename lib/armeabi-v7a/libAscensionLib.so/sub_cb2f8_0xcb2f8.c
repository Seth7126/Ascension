// 函数: sub_cb2f8
// 地址: 0xcb2f8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r6 = arg1[3]
int32_t* r4 = arg1
int32_t* i_4 = r6 + 0x68
int32_t* i = i_4
int32_t* i_2

do
    i_2 = i
    i = *i
while (i != 0)

void* r5_1 = r6 + 0x48
int32_t* i_3 = *r5_1

if (i_3 != 0)
    int32_t* i_1
    
    do
        int32_t r3_1 = *i_3
        *(i_3 + 5) |= 8
        *r5_1 = r3_1
        *i_3 = *i_2
        *i_2 = i_3
        i_2 = i_3
        i_1 = *r5_1
        i_3 = i_1
    while (i_1 != 0)
    i_4 = r4[3] + 0x68

while (true)
    void* r0_2 = *i_4
    
    if (r0_2 == 0)
        break
    
    *(r0_2 + 5) &= 0xbf
    r4, r6 = sub_cbfc0(r4, 0)

int32_t r7 = 0
*(r6 + 0x3e) = 0
*(r6 + 0x3c) = 3
sub_cb400(r4, r5_1, 0xfffffffd)
sub_cb400(r4, r6 + 0x44, 0xfffffffd)
int32_t result = *(r6 + 0x20)

if (result s>= 1)
    int32_t r5_2 = 0
    
    do
        sub_cb400(r4, *(r6 + 0x18) + r7, 0xfffffffd)
        result = *(r6 + 0x20)
        r5_2 += 1
        r7 += 4
    while (r5_2 s< result)

return result
