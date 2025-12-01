// 函数: _ZN14ascensionrules44CStateProcessBanishFromHandOrDiscardOrSource15BuildOptionListER13CStateMachine
// 地址: 0x1368bc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
char* s = *(arg1 + 0x25c)
void* r10 = *(*(arg1 + 0x24c) + 4)
uint32_t __n

if (s == 0)
    __n = 0
else
    __n = strlen(s)

void* i_1 = *(arg1 + 0x264)
int32_t (* const var_e8)(CStateMachine&, CState*, int32_t, uint32_t*)
void* const i_5

if (i_1 != 0)
    if (*(*(i_1 + 0xc) + 0x88) != 3)
        int32_t r1_3 = *(r10 + 0xbd8)
        int32_t r2_1 = *(r10 + 0xbdc)
        
        if (r2_1 != r1_3)
            int32_t i = 0
            
            do
                if (i_1 == *(r1_3 + (i << 3)) && *(r1_3 + (i << 3) + 4) == 7)
                    goto label_136924_1
                
                i += 1
            while (i u< (r2_1 - r1_3) s>> 3)
        
        if (*(r10 + 0x30) u< 0x14)
        label_1369c0:
            i_5 = i_1
            var_e8 =
                ascensionrules::CStateProcessBanishFromHandOrDiscardOrSource::SelectBanishSourceCard
            CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_1 + 8), 0xa061, 
                "Banish %s from play", var_e8)
        else
            int32_t* r1_5 = *(r10 + 0xb80)
            int32_t r2_4 = *(r10 + 0xb84)
            
            if (r1_5 == r2_4)
                goto label_1369c0
            
            while (*r1_5 != i_1)
                r1_5 = &r1_5[2]
                
                if (r2_4 == r1_5)
                    goto label_1369c0
            
            if ((zx.d(r1_5[1].b) & 0x82) == 0)
                goto label_1369c0
            
        label_136924:
            *(arg1 + 0x264) = 0
    else
    label_136924_1:
        *(arg1 + 0x264) = 0

if (zx.d(*(arg1 + 0x254)) != 0)
    void* r4_1 = *(arg1 + 0x24c)
    void* r0_4 = *(r4_1 + 0x3c)
    int32_t* i_2 = *(r0_4 + 0xc)
    
    if (i_2 != *(r0_4 + 0x10))
        do
            void* i_8 = *i_2
            void* r0_6 = *(i_8 + 0xc)
            int32_t r1_8 = *(r0_6 + 0x88)
            
            if (r1_8 != 5)
                int32_t r2_5 = *(arg1 + 0x258)
                
                if (r2_5 == 0 || r1_8 == r2_5)
                    int32_t r0_8
                    
                    if (__n s>= 1)
                        r0_8 = strncasecmp(r0_6 + 4, *(arg1 + 0x25c), __n)
                    
                    if (__n s< 1 || r0_8 == 0)
                        var_e8 = ascensionrules::CStateProcessBanishFromHandOrDiscardOrSource::SelectBanishFromHand
                        i_5 = i_8
                        CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_8 + 8), 0xa061, 
                            "Banish %s from hand", var_e8)
                        r4_1 = *(arg1 + 0x24c)
            
            i_2 = &i_2[1]
        while (i_2 != *(*(r4_1 + 0x3c) + 0x10))

if (zx.d(*(arg1 + 0x255)) != 0)
    void* r1_11 = *(arg1 + 0x24c)
    void* r0_13 = *(r1_11 + 0x40)
    int32_t* i_3 = *(r0_13 + 0xc)
    
    if (i_3 != *(r0_13 + 0x10))
        do
            int32_t r2_7 = *(arg1 + 0x258)
            void* i_7 = *i_3
            
            if (r2_7 == 0)
            label_136b08:
                var_e8 = ascensionrules::CStateProcessBanishFromHandOrDiscardOrSource::SelectBanishFromDiscard
                i_5 = i_7
                CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_7 + 8), 0xa062, 
                    "Banish %s from discard", var_e8)
            else
                void* r0_15 = *(i_7 + 0xc)
                int32_t r9_1 = *(r0_15 + 0x88)
                
                if (zx.d(*(r1_11 + 0xa4)) != 0)
                    int32_t r0_16 = ascension::CCard::IsCardFaction(r0_15)
                    r2_7 = *(arg1 + 0x258)
                    
                    if (r0_16 != 0)
                        r9_1 = 2
                
                if (r9_1 == r2_7)
                    goto label_136b08
            
            r1_11 = *(arg1 + 0x24c)
            i_3 = &i_3[1]
        while (i_3 != *(*(r1_11 + 0x40) + 0x10))

if (zx.d(*(arg1 + 0x256)) != 0)
    void** i_4 = *(r10 + 0xb80)
    
    for (int32_t r0_21 = *(r10 + 0xb84); i_4 != r0_21; i_4 = &i_4[2])
        if ((zx.d(i_4[1].b) & 0xa3) == 0)
            void* i_6 = *i_4
            
            if (i_6 != 0)
                i_5 = i_6
                var_e8 = ascensionrules::CStateProcessBanishFromHandOrDiscardOrSource::SelectBanishFromPlayed
                CGameStateOptions::AddSimpleUserOption(arg1.w, *(i_6 + 8), 0xa061, 
                    "Banish %s from played", var_e8)
                r0_21 = *(r10 + 0xb84)

void* const r6

if (*(arg1 + 0x250) == 0)
    r6 = "Must"
else
    var_e8 = nullptr
    i_5 = nullptr
    CGameStateOptions::AddSimpleUserOption(arg1.w, 0, 0xa000, "None", 0)
    r6 = &data_1cb12e

char str_1[0x80]
str_1[0] = 0

if (zx.d(*(r10 + 0xa14)) == 0)
    char str[0x30]
    str[0] = 0
    void* r0_25 = *(arg1 + 0x264)
    
    if (r0_25 != 0)
        sprintf(&str, ", or Banish %s", *(r0_25 + 0xc) + 4)
    
    char* format
    char (* r3_2)[0x30]
    
    if (zx.d(*(arg1 + 0x254)) != 0)
        r3_2 = &str
        uint32_t r0_29 = zx.d(*(arg1 + 0x256))
        
        if (*(arg1 + 0x264) == 0)
            r3_2 = &data_1bfacb
        
        if (zx.d(*(arg1 + 0x255)) == 0)
            if (r0_29 == 0)
                format = "You %s Banish a Card from Your Hand%s"
            else
                format = "You %s Banish a Card from Your Hand or Played Cards%s"
        else if (r0_29 == 0)
            format = "You %s Banish a Card from Your Hand or Discard Pile%s"
        else
            format = "You %s Banish a Card from Your Hand, Discard Pile or Played Cards%s"
    else if (zx.d(*(arg1 + 0x256)) == 0)
        r3_2 = &str
        format = "You %s Banish a Card from Your Discard Pile%s"
        
        if (*(arg1 + 0x264) == 0)
            r3_2 = &data_1bfacb
    else
        r3_2 = &str
        
        if (*(arg1 + 0x264) == 0)
            r3_2 = &data_1bfacb
        
        if (zx.d(*(arg1 + 0x255)) == 0)
            format = "You %s Banish a Card from Your Played Cards%s"
        else
            format = "You %s Banish a Card from Your Discard Pile or Played Cards%s"
    
    sprintf(&str_1, format, r6, r3_2, var_e8, i_5)

int32_t entry_r1
(*(*arg1 + 0x34))(arg1, entry_r1, *(arg1 + 0x24c), &str_1, var_e8, i_5)
int32_t r0_34 = *__stack_chk_guard

if (r0_34 == r0)
    return r0_34 - r0

__stack_chk_fail()
noreturn
